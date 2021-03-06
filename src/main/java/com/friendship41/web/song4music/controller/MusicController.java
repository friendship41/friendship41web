package com.friendship41.web.song4music.controller;

import com.friendship41.web.repository.entity.Member;
import com.friendship41.web.repository.entity.MusicList;
import com.friendship41.web.song4music.service.MusicListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/song4music")
public class MusicController
{
    @Autowired
    @Qualifier("WebMusicListService")
    private MusicListService webMusicListService;

    @PostMapping(value = "/musics")
    public String addMusicList(MusicList musicList, HttpSession session)
    {
        Member member = (Member) session.getAttribute("member");
        musicList.setMMemberId(member.getMMemberId());
        System.out.println(musicList);
        System.out.println(webMusicListService.addMusicList(musicList));
        return "redirect:/song4music";
    }
}
