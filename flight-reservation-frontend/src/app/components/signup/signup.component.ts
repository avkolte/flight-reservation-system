import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/User';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  user: User = new User();

  
  public myColors = ['#DD2C00', '#FF6D00', '#FFD600', '#AEEA00', '#00C853'];

  constructor(private router: Router, private signUpService: AuthenticationService) { }

  ngOnInit(): void {
  }

  signUp(user:User) {
    console.log(this.user);
    this.signUpService.signUp(user).subscribe();
    this.router.navigate(["login"]);
  }

  firstNameFlag: boolean= false;
  validateFirstName() {
    var flag =  /^[a-zA-Z ]+$/.test(this.user.firstName as string);
    if(!flag) {
      this.firstNameFlag=true;
    }
    else {
      this.firstNameFlag=false;
    }
  }

  lastNameFlag: boolean= false;
  validateLastName() {
    var flag =  /^[a-zA-Z ]+$/.test(this.user.lastName as string);
    if(!flag) {
      this.firstNameFlag=true;
    }
    else {
      this.firstNameFlag=false;
    }
  }

  emailFlag:boolean=false;
  validateEmail(){
      var flag=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.user.email as string);
      if(!flag){
          this.emailFlag=true;
      }else{
          this.emailFlag=false;
      }
  }

  buttonFlag:boolean=true;
    enableButton(){
        this.buttonFlag=this.firstNameFlag||this.emailFlag||this.lastNameFlag;
    }


}
