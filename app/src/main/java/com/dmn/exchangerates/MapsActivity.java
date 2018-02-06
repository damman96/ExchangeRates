package com.dmn.exchangerates;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

private GoogleMap mMap;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
}

@Override
public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String[] currencyNames = getResources().getStringArray(R.array.currency_names);

        LatLng australia = new LatLng(-24.7898383,  134.15638560000002);
        LatLng bulgaria = new LatLng(42.58544425738491, 25.125732421875);
        LatLng brazil = new LatLng(-10.314919285813161, -53.3935546875);
        LatLng canada = new LatLng(59.355596110016315,  -108.193359375);
        LatLng switzerland = new LatLng(46.800059446787316,8.184814453125);
        LatLng china = new LatLng(34.813803317113155,  101.5576171875);
        LatLng czech = new LatLng(49.78835749241399,  15.1007080078125);
        LatLng denmark = new LatLng(55.55038820138172,  11.86798095703125);
        LatLng europe =  new LatLng(48.69096039092549,  10.2392578125);
        LatLng great_britain = new LatLng(52.802761415419674, -1.64794921875);
        LatLng hong_kong = new LatLng(22.405950148725722, 114.11293029785156);
        LatLng croatia = new LatLng(45.644768217751924, 16.0125732421875);
        LatLng hungary =  new LatLng(47.07760411715964,  19.2535400390625);
        LatLng indonesia =  new LatLng(-2.218683588558448,  120.596923828125);
        LatLng japan =  new LatLng(36.20882309283712,  138.71337890625);
        LatLng south_korea =  new LatLng(36.474306755095235, 127.935791015625);
        LatLng mexico =  new LatLng(23.48340065432564,  -102.5244140625);
        LatLng malaysia =  new LatLng(3.337953961416485,  101.84326171875);
        LatLng norway =  new LatLng(61.37567331572747,  8.76708984375);
        LatLng new_zeland =  new LatLng(-41.80407814427234,  173.38623046875);
        LatLng philippines =  new LatLng(11.26461221250444,  123.1787109375);
        LatLng romania =  new LatLng(45.76752296214988,  24.906005859375);
        LatLng russia =  new LatLng(57.13623931917744,  41.1767578125);
        LatLng sweden =   new LatLng(63.74363097533545, 15.8642578125);
        LatLng singapore =  new LatLng(1.3539389150639312, 103.82766723632812);
        LatLng thailand =  new LatLng(14.753635331540442,  100.843505859375);
        LatLng turkey =  new LatLng(39.26628442213066, 34.87060546875);
        LatLng usa =  new LatLng(39.90973623453719,  -102.392578125);
        LatLng south_africa =  new LatLng(-28.806173508854762, 24.63134765625);

        mMap.addMarker(new MarkerOptions().position(australia).title(currencyNames[0]));
        mMap.addMarker(new MarkerOptions().position(bulgaria).title(currencyNames[1]));
        mMap.addMarker(new MarkerOptions().position(brazil).title(currencyNames[2]));
        mMap.addMarker(new MarkerOptions().position(canada).title(currencyNames[3]));
        mMap.addMarker(new MarkerOptions().position(switzerland).title(currencyNames[4]));
        mMap.addMarker(new MarkerOptions().position(china).title(currencyNames[5]));
        mMap.addMarker(new MarkerOptions().position(czech).title(currencyNames[6]));
        mMap.addMarker(new MarkerOptions().position(denmark).title(currencyNames[7]));
        mMap.addMarker(new MarkerOptions().position(europe).title(currencyNames[8]));
        mMap.addMarker(new MarkerOptions().position(great_britain).title(currencyNames[9]));
        mMap.addMarker(new MarkerOptions().position(hong_kong).title(currencyNames[10]));
        mMap.addMarker(new MarkerOptions().position(croatia).title(currencyNames[11]));
        mMap.addMarker(new MarkerOptions().position(hungary).title(currencyNames[12]));
        mMap.addMarker(new MarkerOptions().position(indonesia).title(currencyNames[13]));
        mMap.addMarker(new MarkerOptions().position(japan).title(currencyNames[14]));
        mMap.addMarker(new MarkerOptions().position(south_korea).title(currencyNames[15]));
        mMap.addMarker(new MarkerOptions().position(mexico).title(currencyNames[16]));
        mMap.addMarker(new MarkerOptions().position(malaysia).title(currencyNames[17]));
        mMap.addMarker(new MarkerOptions().position(norway).title(currencyNames[18]));
        mMap.addMarker(new MarkerOptions().position(new_zeland).title(currencyNames[19]));
        mMap.addMarker(new MarkerOptions().position(philippines).title(currencyNames[20]));
        mMap.addMarker(new MarkerOptions().position(romania).title(currencyNames[21]));
        mMap.addMarker(new MarkerOptions().position(russia).title(currencyNames[22]));
        mMap.addMarker(new MarkerOptions().position(sweden).title(currencyNames[23]));
        mMap.addMarker(new MarkerOptions().position(singapore).title(currencyNames[24]));
        mMap.addMarker(new MarkerOptions().position(thailand).title(currencyNames[25]));
        mMap.addMarker(new MarkerOptions().position(turkey).title(currencyNames[26]));
        mMap.addMarker(new MarkerOptions().position(usa).title(currencyNames[27]));
        mMap.addMarker(new MarkerOptions().position(south_africa).title(currencyNames[28]));

}
}
