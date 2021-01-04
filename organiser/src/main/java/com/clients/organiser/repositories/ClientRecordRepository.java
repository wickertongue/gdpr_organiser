package com.clients.organiser.repositories;
import com.clients.organiser.models.ClientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRecordRepository extends JpaRepository<ClientRecord, Long> {
}
