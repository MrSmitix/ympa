-module(ympa_erlang_client_offer_manual_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_manual_dto/0]).

-type ympa_erlang_client_offer_manual_dto() ::
    #{ 'url' := binary(),
       'title' => binary()
     }.

encode(#{ 'url' := Url,
          'title' := Title
        }) ->
    #{ 'url' => Url,
       'title' => Title
     }.
