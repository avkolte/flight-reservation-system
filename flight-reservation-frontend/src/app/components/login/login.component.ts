import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/User';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  errorMessage = "";

  

  email = "";
  password = "";
  invalidLogin=false;

  constructor(private router:Router, private loginService:AuthenticationService) { }

  ngOnInit(): void {
    
    
  }

  checkLogin() {

    this.loginService.authenticate(this.email, this.password);

    
    if(!this.loginService.isUserLoggedIn()) {
      console.log("Invalid Login Credentials..");
     
      this.errorMessage="Invalid Credentials";
      this.invalidLogin=true;
 
    
     
    }
    else {
      

      this.router.navigate(["/"]).then(()=> {
        window.location.reload();
      });

    }
  }

}
