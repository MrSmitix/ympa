-module(ympa_erlang_client_gps_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_gps_dto/0]).

-type ympa_erlang_client_gps_dto() ::
    #{ 'latitude' := integer(),
       'longitude' := integer()
     }.

encode(#{ 'latitude' := Latitude,
          'longitude' := Longitude
        }) ->
    #{ 'latitude' => Latitude,
       'longitude' => Longitude
     }.
