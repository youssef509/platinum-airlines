package com.platinum.platinumAirline.repo;

import com.platinum.platinumAirline.entities.EmaiiNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailNotificationRepo extends JpaRepository<EmaiiNotification, Long> {
}
