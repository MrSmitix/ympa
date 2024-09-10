-module(ympa_erlang_client_calculate_tariffs_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_calculate_tariffs_offer_dto/0]).

-type ympa_erlang_client_calculate_tariffs_offer_dto() ::
    #{ 'categoryId' := integer(),
       'price' := integer(),
       'length' := integer(),
       'width' := integer(),
       'height' := integer(),
       'weight' := integer(),
       'quantity' => integer()
     }.

encode(#{ 'categoryId' := CategoryId,
          'price' := Price,
          'length' := Length,
          'width' := Width,
          'height' := Height,
          'weight' := Weight,
          'quantity' := Quantity
        }) ->
    #{ 'categoryId' => CategoryId,
       'price' => Price,
       'length' => Length,
       'width' => Width,
       'height' => Height,
       'weight' => Weight,
       'quantity' => Quantity
     }.
