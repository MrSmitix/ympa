-module(ympa_erlang_proper_client_return_instance_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_instance_dto/0]).

-export([ympa_erlang_proper_client_return_instance_dto/1]).

-export_type([ympa_erlang_proper_client_return_instance_dto/0]).

-type ympa_erlang_proper_client_return_instance_dto() ::
  [ {'stockType', ympa_erlang_proper_client_return_instance_stock_type:ympa_erlang_proper_client_return_instance_stock_type() }
  | {'status', ympa_erlang_proper_client_return_instance_status_type:ympa_erlang_proper_client_return_instance_status_type() }
  | {'cis', binary() }
  | {'imei', binary() }
  ].


ympa_erlang_proper_client_return_instance_dto() ->
    ympa_erlang_proper_client_return_instance_dto([]).

ympa_erlang_proper_client_return_instance_dto(Fields) ->
  Default = [ {'stockType', ympa_erlang_proper_client_return_instance_stock_type:ympa_erlang_proper_client_return_instance_stock_type() }
            , {'status', ympa_erlang_proper_client_return_instance_status_type:ympa_erlang_proper_client_return_instance_status_type() }
            , {'cis', binary() }
            , {'imei', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

