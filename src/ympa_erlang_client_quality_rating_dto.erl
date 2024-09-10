-module(ympa_erlang_client_quality_rating_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_quality_rating_dto/0]).

-type ympa_erlang_client_quality_rating_dto() ::
    #{ 'rating' := integer(),
       'calculationDate' := calendar:date(),
       'components' := list()
     }.

encode(#{ 'rating' := Rating,
          'calculationDate' := CalculationDate,
          'components' := Components
        }) ->
    #{ 'rating' => Rating,
       'calculationDate' => CalculationDate,
       'components' => Components
     }.
