-module(ympa_erlang_client_get_offers_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offers_response/0]).

-type ympa_erlang_client_get_offers_response() ::
    #{ 'offers' := list(),
       'pager' => ympa_erlang_client_flipping_pager_dto:ympa_erlang_client_flipping_pager_dto()
     }.

encode(#{ 'offers' := Offers,
          'pager' := Pager
        }) ->
    #{ 'offers' => Offers,
       'pager' => Pager
     }.
