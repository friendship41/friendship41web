package com.friendship41.web.song4music.service;

import com.friendship41.web.repository.entity.Music;
import com.friendship41.web.repository.entity.MusicSort;

import java.util.List;

public interface MusicService
{
    public List<Music> getMusics(Long mListSeq);
    public Music addMusicToList(Music music);
    public List<MusicSort> getAllMusicSort();
}
