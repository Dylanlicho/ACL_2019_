package fr.ul.dedale.model.labyrinth;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.ul.dedale.DataFactory.TextureFactory;
import fr.ul.dedale.model.World;


public abstract class Cell {

    // true if the player can't go onto the cell, false otherwise
    private boolean solid;
    // Coordinate of the cell
    protected int x;
    protected int y;
    protected String type;
//    protected int nAnim;
    protected boolean isActivate = false;

    /**
     * Constructor of Cell
     * @param x Abscissa
     * @param y Ordinate
     */
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Return true if the player can't go onto the cell, false otherwise
     * @return
     */
    public abstract boolean isSolid();

    /**
     * Action do when the player is on this cell
     */
    public abstract void activate(World world);

    public void draw (SpriteBatch sb) {
        Texture texture = TextureFactory.getInstance().getImage(type);
        sb.draw(texture,x, y,1,1,0,0,texture.getWidth(),texture.getHeight(),false,false);
    }

    /**
     * getter type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * getter  abscissa coordinate
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * getter ordinate coordinate
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * change the value of the cell
     * true if the cell is activate
     * false if the cell isn't activate
     * @param activate the new value
     */
    public void setActivate(boolean activate) {
        isActivate = activate;
    }
}
