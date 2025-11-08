package com.platinum.platinumAirline.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "email_notification")
@AllArgsConstructor
@NoArgsConstructor
public class EmaiiNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    @NotBlank(message = "Resipient Email is Requires")
    private String recipientEmail;

    @Lob
    private String body;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private LocalDateTime sentAt;

    private boolean isHtml;


}
