package com._paulo.dslist.services;

import com._paulo.dslist.dto.GameDTO;
import com._paulo.dslist.dto.GameListDTO;
import com._paulo.dslist.dto.GameMinDTO;
import com._paulo.dslist.entities.Game;
import com._paulo.dslist.entities.GameList;
import com._paulo.dslist.repositories.GameListRepository;
import com._paulo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
