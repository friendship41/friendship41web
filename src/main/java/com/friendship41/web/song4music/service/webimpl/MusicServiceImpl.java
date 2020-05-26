package com.friendship41.web.song4music.service.webimpl;

import com.friendship41.web.repository.MusicRepository;
import com.friendship41.web.repository.MusicSortRepository;
import com.friendship41.web.repository.entity.Music;
import com.friendship41.web.repository.entity.MusicSort;
import com.friendship41.web.song4music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("WebMusicService")
public class MusicServiceImpl implements MusicService
{
    @Autowired
    private MusicRepository musicRepository;
    @Autowired
    private MusicSortRepository musicSortRepository;

    @Override
    public List<Music> getMusics(Long mListSeq)
    {
        return new ArrayList<>(musicRepository.findBymListSeq(mListSeq));
    }

    @Override
    public Music addMusicToList(Music music)
    {
        return musicRepository.save(music);
    }

    @Override
    public List<MusicSort> getAllMusicSort()
    {
        return new ArrayList<>(musicSortRepository.findAll());
    }
}
