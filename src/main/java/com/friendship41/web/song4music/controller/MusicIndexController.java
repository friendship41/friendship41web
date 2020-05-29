package com.friendship41.web.song4music.controller;

import com.friendship41.web.repository.entity.Member;
import com.friendship41.web.repository.entity.MusicList;
import com.friendship41.web.data.BlockedPage;
import com.friendship41.web.song4music.service.MusicListService;
import com.friendship41.web.song4music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/song4music")
public class MusicIndexController
{
    @Autowired
    @Qualifier("WebMusicListService")
    private MusicListService webMusicListService;
    @Autowired
    @Qualifier("WebMusicService")
    private MusicService webMusicService;

    @RequestMapping(value = "/")
    public String goToMusicIndexPage(
            @PageableDefault(sort = "mListSeq", direction = Sort.Direction.DESC, size = 10)
                    Pageable page, HttpSession session, Model model)
    {
        Member member = (Member)session.getAttribute("member");
        Page<MusicList> musicListPage = webMusicListService.getMusicList(member.getMMemberId(), page);
        BlockedPage blockedPage = new BlockedPage(musicListPage);
        model.addAttribute("musicPage", blockedPage);
        model.addAttribute("musicSortList", webMusicService.getAllMusicSort());
        return "musicManage.html";
    }
}
