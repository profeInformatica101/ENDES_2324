<?php
$base = $altura = $area = $error = null;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $base = isset($_POST['base']) ? (float)$_POST['base'] : null;
    $altura = isset($_POST['altura']) ? (float)$_POST['altura'] : null;

    if ($base <= 0 || $altura <= 0) {
        $error = "Por favor, introduzca números positivos para la base y la altura.";
    } else {
        $area = $base * $altura;
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Calculadora de Área de Rectángulo</title>
</head>
<body>
    <h2>Calculadora de área de rectángulo</h2>

    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
        <label for="base">Base:</label>
        <input type="number" name="base" id="base" value="<?php echo $base; ?>" step="0.01" required>
        <br><br>

        <label for="altura">Altura:</label>
        <input type="number" name="altura" id="altura" value="<?php echo $altura; ?>" step="0.01" required>
        <br><br>

        <input type="submit" value="Calcular">
    </form>

    <?php
    if ($error) {
        echo "<p style='color:red;'>$error</p>";
    } elseif (!is_null($area)) {
        echo "<p>El área del rectángulo es: <strong>$area</strong></p>";
    }
    ?>
</body>
</html>
