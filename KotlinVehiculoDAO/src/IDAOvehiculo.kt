interface IDAOvehiculo {
    fun insertaVehiculo(vehiculo: Vehiculo)
    fun eliminarVehiculo(vehiculo: Vehiculo)
    fun eliminarVehiculo(matricula: String)
    fun eliminarVehiculos(vehiculo: List<Vehiculo>)
}
