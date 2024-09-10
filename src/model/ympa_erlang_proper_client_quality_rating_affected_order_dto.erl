-module(ympa_erlang_proper_client_quality_rating_affected_order_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_quality_rating_affected_order_dto/0]).

-export([ympa_erlang_proper_client_quality_rating_affected_order_dto/1]).

-export_type([ympa_erlang_proper_client_quality_rating_affected_order_dto/0]).

-type ympa_erlang_proper_client_quality_rating_affected_order_dto() ::
  [ {'orderId', integer() }
  | {'description', binary() }
  | {'componentType', ympa_erlang_proper_client_affected_order_quality_rating_component_type:ympa_erlang_proper_client_affected_order_quality_rating_component_type() }
  ].


ympa_erlang_proper_client_quality_rating_affected_order_dto() ->
    ympa_erlang_proper_client_quality_rating_affected_order_dto([]).

ympa_erlang_proper_client_quality_rating_affected_order_dto(Fields) ->
  Default = [ {'orderId', integer(0) }
            , {'description', binary() }
            , {'componentType', ympa_erlang_proper_client_affected_order_quality_rating_component_type:ympa_erlang_proper_client_affected_order_quality_rating_component_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

