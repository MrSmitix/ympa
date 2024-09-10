-module(ympa_erlang_client_get_promos_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promos_request/0]).

-type ympa_erlang_client_get_promos_request() ::
    #{ 'participation' => ympa_erlang_client_promo_participation_type:ympa_erlang_client_promo_participation_type(),
       'mechanics' => ympa_erlang_client_mechanics_type:ympa_erlang_client_mechanics_type()
     }.

encode(#{ 'participation' := Participation,
          'mechanics' := Mechanics
        }) ->
    #{ 'participation' => Participation,
       'mechanics' => Mechanics
     }.
