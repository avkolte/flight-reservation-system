import { HttpBackend, HttpClient } from '@angular/common/http';
import { TmplAstRecursiveVisitor } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { User } from '../model/User';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  

  constructor(private http:HttpClient) { }

  authenticate(email: string, password: string) {

    return this.http.post<any>('http://localhost:8095/api/v1/verifyLogin',
    {email, password}).subscribe(
      userData => {
        sessionStorage.setItem('email', email);
       // let tokenStr = 'Bearer' +userData.token;
       // sessionStorage.setItem('token', tokenStr);
        return true;
      }
    );
  }

  isUserLoggedIn():boolean {
    let user = sessionStorage.getItem('email');
    return !(user === "");
  }

  logOut() {
    sessionStorage.removeItem('email');
    sessionStorage.removeItem('userId');
  }

  signUp(user: User) {
    return this.http.post('http://localhost:8095/api/v1/user', user);
  }
}
