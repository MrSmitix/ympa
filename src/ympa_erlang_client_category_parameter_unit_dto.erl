-module(ympa_erlang_client_category_parameter_unit_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_category_parameter_unit_dto/0]).

-type ympa_erlang_client_category_parameter_unit_dto() ::
    #{ 'defaultUnitId' := integer(),
       'units' := list()
     }.

encode(#{ 'defaultUnitId' := DefaultUnitId,
          'units' := Units
        }) ->
    #{ 'defaultUnitId' => DefaultUnitId,
       'units' => Units
     }.
