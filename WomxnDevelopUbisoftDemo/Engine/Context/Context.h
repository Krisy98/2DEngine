#pragma once

class Context {

public :

    virtual void update(float deltaTime) = 0;
    virtual void render(sf::RenderTarget& target) = 0;
    virtual void renderDebugMenu(sf::RenderTarget& target) = 0;
    virtual void handleEvent(sf::Event event) = 0;

};

