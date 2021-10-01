import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  buttonFlag: boolean | undefined;
  email:string = "";

  constructor(private authenticationService: AuthenticationService,
    private router: Router) { }

  ngOnInit(): void {

    
    this.buttonFlag=this.authenticationService.isUserLoggedIn();
    this.email = sessionStorage.getItem('email') as string;
    
  }

  logOut()
  {
    this.authenticationService.logOut();
    this.buttonFlag=this.authenticationService.isUserLoggedIn();
    sessionStorage.setItem('email', "");
    sessionStorage.setItem('userId', ""); 
    this.router.navigate(["login"]).then(()=> {
      window.location.reload();
    });


    
  }


}
