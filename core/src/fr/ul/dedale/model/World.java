package fr.ul.dedale.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.ul.dedale.DataFactory.DirectionFactory;
import fr.ul.dedale.model.character.Player;

public class World {
    Player hero ;

    public World(){
        hero = new Player(25,25);
    }

    public void draw(SpriteBatch sb){
        hero.draw(sb);
    }

    public void moveHero(DirectionFactory direction){
        switch (direction){
            case TOP :  hero.moveTop();
            break;

            case BOTTOM :  hero.moveBottom();
                break;

            case LEFT : { hero.moveLeft();
                break; }

            case RIGHT : { hero.moveRight();
                break; }

        }
    }

    /**
     * Apply some damage to the player
     * @param damage Number of damage applied to the player
     */
    public void damagePlayer(int damage){
        hero.decreaseHp(damage);
    }

    public void teleportPlayer(int x, int y){
        hero.setX(x);
        hero.setY(y);
    }

}
