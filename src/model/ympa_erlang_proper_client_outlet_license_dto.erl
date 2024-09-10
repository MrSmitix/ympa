-module(ympa_erlang_proper_client_outlet_license_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_license_dto/0]).

-export([ympa_erlang_proper_client_outlet_license_dto/1]).

-export_type([ympa_erlang_proper_client_outlet_license_dto/0]).

-type ympa_erlang_proper_client_outlet_license_dto() ::
  [ {'id', integer() }
  | {'outletId', integer() }
  | {'licenseType', ympa_erlang_proper_client_license_type:ympa_erlang_proper_client_license_type() }
  | {'number', binary() }
  | {'dateOfIssue', datetime() }
  | {'dateOfExpiry', datetime() }
  ].


ympa_erlang_proper_client_outlet_license_dto() ->
    ympa_erlang_proper_client_outlet_license_dto([]).

ympa_erlang_proper_client_outlet_license_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'outletId', integer() }
            , {'licenseType', ympa_erlang_proper_client_license_type:ympa_erlang_proper_client_license_type() }
            , {'number', binary() }
            , {'dateOfIssue', datetime() }
            , {'dateOfExpiry', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

