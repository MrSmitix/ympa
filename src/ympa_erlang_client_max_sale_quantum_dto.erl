-module(ympa_erlang_client_max_sale_quantum_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_max_sale_quantum_dto/0]).

-type ympa_erlang_client_max_sale_quantum_dto() ::
    #{ 'id' := integer(),
       'name' => binary(),
       'maxSaleQuantum' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'maxSaleQuantum' := MaxSaleQuantum
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'maxSaleQuantum' => MaxSaleQuantum
     }.
