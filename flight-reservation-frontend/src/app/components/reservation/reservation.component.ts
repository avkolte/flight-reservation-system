import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {

  reservationId: number | undefined;

  constructor(private route:ActivatedRoute) { }

  ngOnInit(): void {

    this.reservationId = Number.parseInt(this.route.snapshot.params.id);
  }

}
