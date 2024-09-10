-module(ympa_erlang_proper_client_logistic_pickup_point_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_logistic_pickup_point_dto/0]).

-export([ympa_erlang_proper_client_logistic_pickup_point_dto/1]).

-export_type([ympa_erlang_proper_client_logistic_pickup_point_dto/0]).

-type ympa_erlang_proper_client_logistic_pickup_point_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'address', ympa_erlang_proper_client_pickup_address_dto:ympa_erlang_proper_client_pickup_address_dto() }
  | {'instruction', binary() }
  | {'type', ympa_erlang_proper_client_logistic_point_type:ympa_erlang_proper_client_logistic_point_type() }
  | {'logisticPartnerId', integer() }
  ].


ympa_erlang_proper_client_logistic_pickup_point_dto() ->
    ympa_erlang_proper_client_logistic_pickup_point_dto([]).

ympa_erlang_proper_client_logistic_pickup_point_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'address', ympa_erlang_proper_client_pickup_address_dto:ympa_erlang_proper_client_pickup_address_dto() }
            , {'instruction', binary() }
            , {'type', ympa_erlang_proper_client_logistic_point_type:ympa_erlang_proper_client_logistic_point_type() }
            , {'logisticPartnerId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

