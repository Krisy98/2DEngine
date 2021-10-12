#include "stdafx.h"
#include "Game.h"


Game::Game()
    : GameBase{ " Ecosystem " }
{
    


}

void Game::Update(float deltaTime){

}

void Game::Render(sf::RenderTarget& target){
    target.clear(sf::Color(0, 0, 0));

}

void Game::RenderDebugMenu(sf::RenderTarget& target){

}

void Game::HandleEvent(sf::Event event){

}
