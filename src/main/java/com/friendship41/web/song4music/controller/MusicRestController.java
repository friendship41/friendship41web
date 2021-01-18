package com.friendship41.web.song4music.controller;

import com.friendship41.web.repository.entity.Music;
import com.friendship41.web.song4music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/song4music")
public class MusicRestController
{
    @Autowired
    @Qualifier("WebMusicService")
    private MusicService webMusicService;


    @GetMapping(value = "/musics")
    public List<Music> getMusics(@RequestParam("mListSeq") Long mListSeq)
    {
        return webMusicService.getMusics(mListSeq);
    }

    @PostMapping(value = "/music")
    public Music addMusic(Music music)
    {
        try
        {
            return webMusicService.addMusicToList(music);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
