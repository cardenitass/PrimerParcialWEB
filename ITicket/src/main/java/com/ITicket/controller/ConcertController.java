
package com.ITicket.controller;


import com.ITicket.entity.Artist;
import com.ITicket.entity.Concert;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.ITicket.service.IArtistService;
import com.ITicket.service.IConcertService;

@Controller
public class ConcertController {
    
    @Autowired
    private IConcertService concertService;
    
    @Autowired
    private IArtistService artistService;
    
    
    @GetMapping("/concierto")
    
    public String index(Model model){
        
        List<Concert> listaConcierto = concertService.getAllConcierto();
        
        model.addAttribute("title", "Tabla Concierto");
        
        model.addAttribute("concierto", listaConcierto);
        
        return "concerts";
    }
    
    @GetMapping("/conciertoN")
    public String crearPersona(Model model){
        List<Artist> listaArtista = artistService.listArtista();        
        model.addAttribute("concierto", new Concert());       
        model.addAttribute("artist", listaArtista);
        return "build";
    }
    
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concert concierto){
        concertService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
    
    @GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id") int idConcierto, Model model){
        Concert concierto = concertService.getConciertoById(idConcierto);
        List<Artist> listaArtista = artistService.listArtista();
        model.addAttribute("concierto", concierto);
        model.addAttribute("artist", listaArtista);
        return "build";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id")Integer idConcierto){
        concertService.delete(idConcierto);
        return "redirect:/concierto";
    } 
}
