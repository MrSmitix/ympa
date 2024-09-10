#See https://aka.ms/containerfastmode to understand how Visual Studio uses this Dockerfile to build your images for faster debugging.

# Container we use for final publish
FROM mcr.microsoft.com/dotnet/core/aspnet:8.0-buster-slim AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

# Build container
FROM mcr.microsoft.com/dotnet/core/sdk:8.0-buster AS build

# Copy the code into the container
WORKDIR /src
COPY ["src/ympa_aspnetcore_server/ympa_aspnetcore_server.csproj", "ympa_aspnetcore_server/"]

# NuGet restore
RUN dotnet restore "ympa_aspnetcore_server/ympa_aspnetcore_server.csproj"
COPY ["src/ympa_aspnetcore_server/", "ympa_aspnetcore_server/"]

# Build the API
WORKDIR "ympa_aspnetcore_server"
RUN dotnet build "ympa_aspnetcore_server.csproj" -c Release -o /app/build

# Publish it
FROM build AS publish
RUN dotnet publish "ympa_aspnetcore_server.csproj" -c Release -o /app/publish

# Make the final image for publishing
FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "ympa_aspnetcore_server.dll"]
