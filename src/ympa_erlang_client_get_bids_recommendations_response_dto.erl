-module(ympa_erlang_client_get_bids_recommendations_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_bids_recommendations_response_dto/0]).

-type ympa_erlang_client_get_bids_recommendations_response_dto() ::
    #{ 'recommendations' := list()
     }.

encode(#{ 'recommendations' := Recommendations
        }) ->
    #{ 'recommendations' => Recommendations
     }.
