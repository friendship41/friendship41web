package com.friendship41.web.song4music.service;

import com.friendship41.web.repository.entity.MusicList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MusicListService
{
    public Page<MusicList> getMusicList(String MMemberId, Pageable pageable);
    public MusicList addMusicList(MusicList musicList);
}
