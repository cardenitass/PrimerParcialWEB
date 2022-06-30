
package com.ITicket.service;

import com.ITicket.entity.Artist;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITicket.repository.ArtistRepository;


@Service

public class ArtistService implements IArtistService{
    
    @Autowired
    private ArtistRepository artistaRepository;

    @Override
    public List<Artist> listArtista() {
        return (List<Artist>) artistaRepository.findAll();
    }

}
