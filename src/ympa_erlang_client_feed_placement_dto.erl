-module(ympa_erlang_client_feed_placement_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_placement_dto/0]).

-type ympa_erlang_client_feed_placement_dto() ::
    #{ 'status' => ympa_erlang_client_feed_status_type:ympa_erlang_client_feed_status_type(),
       'totalOffersCount' => integer()
     }.

encode(#{ 'status' := Status,
          'totalOffersCount' := TotalOffersCount
        }) ->
    #{ 'status' => Status,
       'totalOffersCount' => TotalOffersCount
     }.
