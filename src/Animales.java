
public abstract class Animales {
	//atributos
		
	    public abstract void desplazarse();
	    public abstract void hacerSonidos();
	}

	class Perro extends Animales {
	    @Override
	    public void desplazarse() {
	        System.out.println("Camina");
	    }

	    @Override
	    public void hacerSonidos() {
	        System.out.println("Guaf Guaf");
	    }
	}

	class Gato extends Animales {
	    @Override
	    public void desplazarse() {
	        System.out.println("Camina");
	    }

	    @Override
	    public void hacerSonidos() {
	        System.out.println("Miau Miau");
	    }
	}

	class Vaca extends Animales {

		@Override
		public void desplazarse() {
	        System.out.println("Camina");
		}
	
		@Override
		public void hacerSonidos() {
	        System.out.println("Muuu Muuuu");
			
		}
	}
	
	class Pato extends Animales {

		@Override
		public void desplazarse() {
			System.out.println("Camina");			
		}

		@Override
		public void hacerSonidos() {
			System.out.println("Cuak Cuak");			
			
		}
	}
	
	class Pollito extends Animales {

		@Override
		public void desplazarse() {
		System.out.println("Vuela");	
		}

		@Override
		public void hacerSonidos() {
			System.out.println("Pio Pio");	
			
		}
	
	

}//public abstract