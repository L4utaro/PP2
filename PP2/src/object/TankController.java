package object;

import entorno.Entorno;
import enums.Orientation;

@SuppressWarnings("unused")
public class TankController {
	private Tank tank;
	
	
	public TankController(Tank tank){
		this.tank = tank;
	}
	
	public void ControlUp()
	{
		tank.moverseArriba();
	}
	public void ControlDown()
	{
		tank.moverseAbajo();
	}
	public void ControlRigth()
	{
		tank.moverseDerecha();
	}
	public void ControlLeft()
	{
		tank.moverseIzquierda();
	}
	
	public void ControlTank(Entorno ent)
	{
		if(ent.estaPresionada(ent.TECLA_ARRIBA))
			ControlUp();
		if(ent.estaPresionada(ent.TECLA_ABAJO))
			ControlDown();
		if(ent.estaPresionada(ent.TECLA_DERECHA))
			ControlRigth();
		if(ent.estaPresionada(ent.TECLA_IZQUIERDA))
			ControlLeft();		
		if(ent.estaPresionada(ent.TECLA_CTRL))
			this.tank.disparar();
	}
	
}
