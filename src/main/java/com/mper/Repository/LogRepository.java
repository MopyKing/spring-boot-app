package com.mper.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mper.Model.Log;
public interface LogRepository extends JpaRepository<Log, Integer>
{

}