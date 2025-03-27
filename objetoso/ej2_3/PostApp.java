package ej2_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
	
	private List<Post> posts;
	
	/**
	* Retorna los últimos N posts que no pertenecen al usuario user
	*/
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
	        
		//Extract method
	    List<Post> postsOtrosUsuarios = extracted(user);
	    //
	      
	    //Extract method
	    extracted(postsOtrosUsuarios);
	        
	    //Extract method
	    return extracted(cantidad, postsOtrosUsuarios);
	}

	private void extracted(List<Post> postsOtrosUsuarios) {
		// ordena los posts por fecha
		   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
		       int masNuevo = i;
		       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
		           if (postsOtrosUsuarios.get(j).despuesDe(postsOtrosUsuarios.get(masNuevo).getFecha())) {//feature envy
		              masNuevo = j;
		           }    
		       }
		      //Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));//temporary field
		      postsOtrosUsuarios.set(masNuevo, postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo)));    
		   }
	}

	private List<Post> extracted(int cantidad, List<Post> postsOtrosUsuarios) {
		List<Post> ultimosPosts = new ArrayList<Post>();
	    int index = 0;
	    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
	    while (postIterator.hasNext() &&  index < cantidad) {
	        ultimosPosts.add(postIterator.next());
	    }
	    return ultimosPosts;
	}

	private List<Post> extracted(Usuario user) {
		//No se si tiene nombre pero seria mas util usar un stream
		/*
		List<Post> postsOtrosUsuarios = new ArrayList<Post>();
	    for (Post post : this.posts) {
	        if (!post.mismoUsuario(user)) {//feature envy
	            postsOtrosUsuarios.add(post);
	        }
	    }
	    */
		return this.posts.stream().filter(a->!a.mismoUsuario(user)).toList();
	}

}
