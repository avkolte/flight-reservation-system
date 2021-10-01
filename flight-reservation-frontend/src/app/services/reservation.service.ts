import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {


  reservationURL: string = "http://localhost:8095/api/v1/passengerDetails";


  constructor(private http: HttpClient) { }

  public saveReservation(reservation:any):any{
    return this.http.post(this.reservationURL,reservation).
    pipe(
      map(res=>{
        return res;
      },
        ( err: any)=>{
        console.error(err);
      })
    )
  }
  
}
