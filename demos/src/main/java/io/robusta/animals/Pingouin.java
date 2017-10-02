package io.robusta.animals;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class Pingouin implements Comparable<Pingouin>{

    String name;
    int speed = 10;

    public Pingouin(String name) {
        this.name = name;
    }
    
    public String swim(){
    	return "plouf";
    }
    
    public void slide(){
    	System.out.println("Sliding at "+this.speed+" mph");
    }
    
    public void setSpeed(int speed) {
		this.speed = speed;
	}
    
    @Override
    public String toString() {
    	return this.name;
    }

	@Override
	public int compareTo(Pingouin other) {
		if(this.speed < other.speed){
			return -1;
		}
		if(this.speed == other.speed){
			return 0;
		}
		
		return 88;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pingouin other = (Pingouin) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	}
