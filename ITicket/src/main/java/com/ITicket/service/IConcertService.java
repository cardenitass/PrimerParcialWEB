
package com.ITicket.service;

import com.ITicket.entity.Concert;
import java.util.List;


public interface IConcertService{
    
    
    public List<Concert> getAllConcierto();
    
    public Concert getConciertoById (Integer id);
     
    public void saveConcierto(Concert concierto);
    
    public void delete(Integer id);
    
}
