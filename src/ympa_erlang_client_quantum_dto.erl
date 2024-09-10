-module(ympa_erlang_client_quantum_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_quantum_dto/0]).

-type ympa_erlang_client_quantum_dto() ::
    #{ 'minQuantity' => integer(),
       'stepQuantity' => integer()
     }.

encode(#{ 'minQuantity' := MinQuantity,
          'stepQuantity' := StepQuantity
        }) ->
    #{ 'minQuantity' => MinQuantity,
       'stepQuantity' => StepQuantity
     }.
