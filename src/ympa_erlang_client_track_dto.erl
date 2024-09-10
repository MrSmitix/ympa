-module(ympa_erlang_client_track_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_track_dto/0]).

-type ympa_erlang_client_track_dto() ::
    #{ 'trackCode' => binary()
     }.

encode(#{ 'trackCode' := TrackCode
        }) ->
    #{ 'trackCode' => TrackCode
     }.
