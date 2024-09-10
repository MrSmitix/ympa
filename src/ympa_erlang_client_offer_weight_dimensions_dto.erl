-module(ympa_erlang_client_offer_weight_dimensions_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_weight_dimensions_dto/0]).

-type ympa_erlang_client_offer_weight_dimensions_dto() ::
    #{ 'length' := integer(),
       'width' := integer(),
       'height' := integer(),
       'weight' := integer()
     }.

encode(#{ 'length' := Length,
          'width' := Width,
          'height' := Height,
          'weight' := Weight
        }) ->
    #{ 'length' => Length,
       'width' => Width,
       'height' => Height,
       'weight' => Weight
     }.
