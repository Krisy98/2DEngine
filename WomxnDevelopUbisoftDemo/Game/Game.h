#pragma once

#include <Engine/GameBase.h>

class GameDemo : public GameBase{

public:
    GameDemo();

    void Update(float deltaTime) override;
    void Render(sf::RenderTarget& target) override;
    void RenderDebugMenu(sf::RenderTarget& target) override;
    void HandleEvent(sf::Event event) override;


};