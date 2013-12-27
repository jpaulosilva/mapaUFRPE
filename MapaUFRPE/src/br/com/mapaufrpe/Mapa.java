package br.com.mapaufrpe;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.Builder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends Activity {

	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();

		map.setMyLocationEnabled(true);

		final LatLng centroMapa = new LatLng(-8.014565, -34.948688);

		map.moveCamera(CameraUpdateFactory.newLatLngZoom(centroMapa, 17));

		CameraPosition posicaoCamera = new Builder().target(centroMapa)
				.zoom((float) 15.3).bearing(370).tilt(30).build();

		map.animateCamera(CameraUpdateFactory.newCameraPosition(posicaoCamera));
		
		

		Marker predioCentral = map.addMarker(new MarkerOptions()
				.position(new LatLng(-8.014433, -34.950377)).title("UFRPE")
				.snippet("Prédio Central"));

		Marker zootecnia = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.019845, -34.954151)).title("Dpto. de Zootecnia"));

		Marker cegoe = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.017303, -34.950137)).title("CEGOE"));

		Marker quadra = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.017949, -34.949735)).title("Quadra"));

		Marker dlch = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.018856, -34.949578)).title("DLCH"));

		Marker economiaDomestica = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.016344, -34.950137)).title("Economia Doméstica"));

		Marker xeroxPesca = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.016642, -34.949814)).title("Xerox Pesca"));

		Marker depPesca = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.016352, -34.949958)).title("Dpto. de Pesca"));

		Marker deinfo = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.015635, -34.950973)).title("DEINFO"));

		Marker ead = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.01588, -34.950526)).title("EAD"));

		Marker drca = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.014101, -34.950555)).title("DRCA"));

		Marker banco = map.addMarker(new MarkerOptions()
				.position(new LatLng(-8.013806, -34.950793)).title("Banco")
				.snippet("Bradesco"));

		Marker ru = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.013807, -34.950835)).title(
				"Restaurante Universitário"));

		Marker predioBio = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.013789, -34.950418)).title("Prédio Biologia"));

		Marker biblioteca = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.013757, -34.948961)).title("Biblioteca Central"));

		Marker proplanNTI = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.014275, -34.947671)).title("PROPLAN/NTI"));

		Marker hVeterinario = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.014565, -34.948688))
				.title("Hospital Veterinário"));

		Marker casaEstudante02 = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.015084, -34.947385))
				.title("Casa do Estudante 02"));

		Marker ceagriII = map.addMarker(new MarkerOptions()
				.position(new LatLng(-8.017691, -34.944595))
				.title("Edf. João Vasconcelos Sobrinho").snippet("CEAGRI II"));

		Marker casaEstudante01 = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.016083, -34.944315))
				.title("Casa do Estudante 01"));

		Marker mesaFarta = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.017757, -34.945118)).title("Mesa Farta"));

		Marker ceagriI = map.addMarker(new MarkerOptions()
				.position(new LatLng(-8.017772, -34.944393))
				.title("Edf. Rildo Sartori").snippet("CEAGRI I"));

		Marker dptFlorestais = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.017123, -34.945705)).title(
				"Dpto. de Ciências Florestais"));

		Marker dptTecRural = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.017221, -34.946473)).title(
				"Dpto. de Tecnologia Rural"));

		Marker adm = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.019265, -34.949038)).title("Administração"));

		Marker fitopatologia = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.016302, -34.944707)).title(
				"Área de Fitopatologia"));

		Marker estAquicultura = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.019836, -34.944954)).title(
				"Estação de Aquicultura"));

		Marker estufas = map.addMarker(new MarkerOptions().position(
				new LatLng(-8.017026, -34.944921)).title("Estufas"));

	}
}