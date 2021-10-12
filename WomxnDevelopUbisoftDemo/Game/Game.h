#pragma once

#include <Engine/GameBase.h>

class Game : public GameBase{

public:
    Game();

    void Update(float deltaTime) override;
    void Render(sf::RenderTarget& target) override;
    void RenderDebugMenu(sf::RenderTarget& target) override;
    void HandleEvent(sf::Event event) override;


};