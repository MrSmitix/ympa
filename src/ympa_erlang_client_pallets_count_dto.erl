-module(ympa_erlang_client_pallets_count_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_pallets_count_dto/0]).

-type ympa_erlang_client_pallets_count_dto() ::
    #{ 'planned' => integer(),
       'fact' => integer()
     }.

encode(#{ 'planned' := Planned,
          'fact' := Fact
        }) ->
    #{ 'planned' => Planned,
       'fact' => Fact
     }.
