
package com.ITicket.service;

import com.ITicket.entity.Concert;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITicket.repository.ConcertRepository;

@Service

public class ConcertService implements IConcertService{
    
    @Autowired
    
    private ConcertRepository conciertoRepository;

    @Override
    public List<Concert> getAllConcierto() {
        return (List<Concert>) conciertoRepository.findAll();
    }

    @Override
    public Concert getConciertoById(Integer id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concert concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(Integer id) {
        conciertoRepository.deleteById(id);
    }
}
