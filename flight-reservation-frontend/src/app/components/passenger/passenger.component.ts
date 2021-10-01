import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Passenger } from 'src/app/model/Passenger';
import { FlightService } from 'src/app/services/flight.service';
import { ReservationService } from 'src/app/services/reservation.service';

@Component({
  selector: 'app-passenger',
  templateUrl: './passenger.component.html',
  styleUrls: ['./passenger.component.css']
})
export class PassengerComponent implements OnInit {

  

  passenger:Passenger = new Passenger();
  flightData:any;

  constructor(private router: Router, private route:ActivatedRoute, private flightService: FlightService, private reservationService: ReservationService) { }

  ngOnInit(): void {

    this.flightService.getFlight(Number.parseInt(this.route.snapshot.params.id)).subscribe(
      (res: any)=>{
        this.flightData=res;
      }
    )
  }

  public onSubmit(passenger:any){
    passenger.flightId = this.flightData.id;
    this.reservationService.saveReservation(passenger).subscribe(
      ( res:any)=>{
        this.router.navigate(['/reservation/',+res.id])
      }
    )
  }

}
