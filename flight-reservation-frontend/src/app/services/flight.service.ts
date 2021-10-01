import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  flightsURL: string = "http://localhost:8095/api/v1/findFlights";
  flightURL: string = "http://localhost:8095/api/v1/flight";
  flightData:any;

  constructor(private http: HttpClient) { }

  public getFlights(from:string, to:string){
    return this.http.get(this.flightsURL+"?from="+from+"&to="+to).
    pipe(
      map(res=>{
        this.flightData = res;
      }
      )
    )
  }

  public getFlight(id:number):any{
    return this.http.get(this.flightURL+"/"+id).
     pipe(
       map(res=>{
         return res;
       },
         (err: any)=>{
         console.error(err);
       })
     )
   }
}
